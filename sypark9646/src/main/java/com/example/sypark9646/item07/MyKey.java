package com.example.sypark9646.item07;

public class MyKey {

		private String key;

		public MyKey(String key) {
				this.key = key;
		}

		@Override
		public boolean equals(Object obj) {
				if (obj == null) {
						return false;
				}

				if (obj.getClass() != this.getClass()) {
						return false;
				}

				return this.key.equals(obj.toString());
		}

		@Override
		public int hashCode() {
				return key.hashCode();
		}

		@Override
		public String toString() {
				return key;
		}
}
