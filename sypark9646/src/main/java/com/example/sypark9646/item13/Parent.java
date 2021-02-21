package com.example.sypark9646.item13;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
@Getter
public class Parent implements Cloneable {

		private String parentField;

		public Parent(String parentField) {
				this.parentField = parentField;
		}

		public Parent(Parent parent) { // 복사 생성자
				this.parentField = parent.getParentField();
		}

		public static Parent newInstance(Parent parent) { // 복사 팩터리
				return new Parent(parent.getParentField());
		}

		@Override
		public Parent clone() throws CloneNotSupportedException {
				Object clone = super.clone();
				// Parent clone = new Parent(this.getParentField()); // Child class 에서 다운캐스팅 시 런타임 에러 발생
				log.info("class Parent: " + clone.getClass());
				return (Parent) clone;
		}
}
