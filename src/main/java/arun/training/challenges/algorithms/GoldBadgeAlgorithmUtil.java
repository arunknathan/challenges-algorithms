package arun.training.challenges.algorithms;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoldBadgeAlgorithmUtil {

	public String angryProfessor(int k, int[] a) {
		return Arrays.stream(a).parallel().filter(x -> x < 1).count() < k ? "YES" : "NO";
	}

	public int beautifulDays(int i, int j, int k) {
		return (int) java.util.stream.IntStream.range(i, j).parallel().filter(x -> isBeautifulDay(k, x)).count();
	}

	private boolean isBeautifulDay(int k, int x) {
		return Math.abs(x - Integer.parseInt(new StringBuilder("" + x).reverse().toString().replaceAll("^0+", "")))
				% k == 0;
	}

	public int viralAdvertising(int n) {
		int recipients = 5;
		int count = 0;

		for (int i = 1; i <= n; i++) {
			int liked = recipients / 2;
			count += liked;
			recipients = 3 * liked;
		}

		return count;
	}

	public int saveThePrisoner(int n, int m, int s) {
		int last = m % n;
		last = (last == 0) ? n : last;
		last = last + s - 1;
		last = (last % n);
		last = (last == 0) ? n : last;
		return last;
	}

	public int[] circularArrayRotation(int[] a, int k, int[] queries) {
		class Node {
			int value;
			Node prev;
		}

		Node root = new Node();
		Node current = root;
		Node prev = null;
		for (int i = 0; i < a.length - 1; i++) {
			current.value = a[i];
			prev = current;
			current = new Node();
			current.prev = prev;
		}
		current.value = a[a.length - 1];
		root.prev = current;

		current = root;
		for (int i = 0; i <= k; i++) {
			current = current.prev;
		}

		Node newRoot = current;

		Deque<Node> deque = new ArrayDeque<>();
		deque.add(newRoot);
		while (current.prev != null) {
			current = current.prev;
			if (current == newRoot) {
				break;
			} else {
				deque.addFirst(current);
			}
		}

		List<Node> results = new ArrayList<>();
		results.addAll(deque);

		return Arrays.stream(queries).map(x -> results.get(x).value).toArray();
	}

	public int[] permutationEquation(int[] p) {
		int[] y = new int[p.length];
		Map<Integer, Integer> cache = getCache(p);
		for (int i = 1; i <= y.length; i++) {
			y[i - 1] = cache.get(cache.get(i));
		}
		return y;
	}

	private Map<Integer, Integer> getCache(int[] p) {
		Map<Integer, Integer> cache = new HashMap<>();
		for (int i = 0; i < p.length; i++) {
			cache.put(p[i], 1 + i);
		}
		return cache;
	}

	public int jumpingOnClouds(int[] c, int k) {
		class CloudJumper {
			private int[] clouds;
			private int step;
			private int position;
			private int energy = 100;

			public CloudJumper(int[] c, int k) {
				this.clouds = c;
				this.step = k;
			}

			@Override
			public String toString() {
				return "{clouds:[" + Arrays.toString(clouds) + "],step:" + step + ",position:" + position + ",energy:"
						+ energy + "}";
			}

			public CloudJumper init() {
				if (c[0] == 1) {
					energy -= 2;
				}
				return this;
			}

			private CloudJumper jump() {
				--energy;
				position = getNextPosition();
				if (clouds[position] == 1) {
					energy -= 2;
				}
				return this;
			}

			private int getNextPosition() {
				return (position + step) % clouds.length;
			}

			public CloudJumper jumpTillStart() {
				do {
					jump();
				} while (position != 0);
				return this;
			}

			public int getEnergy() {
				return energy;
			}
		}
		return new CloudJumper(c, k).init().jumpTillStart().getEnergy();
	}

}
