package com.example.sypark9646.item13;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class Child extends Parent {

		private int childField;

		public Child(String parentField, int childField) {
				super(parentField);
				this.childField = childField;
		}

		@Override
		public Child clone() throws CloneNotSupportedException {
				Object clone = super.clone();
				log.info("class Child: " + clone.getClass());
				return (Child) clone;
		}

		@Override
		public String toString() {
				return "Child(parentField=" + this.getParentField() + ", childField=" + this.getChildField() + ")";
		}
}
