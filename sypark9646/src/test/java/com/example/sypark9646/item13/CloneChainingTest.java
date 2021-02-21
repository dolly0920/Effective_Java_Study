package com.example.sypark9646.item13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CloneChainingTest {

		@Test
		@DisplayName("clone test")
		void superCloneAndInteritenceTest() throws CloneNotSupportedException {
				Parent parent = new Parent("parent");
				Child child = new Child("parent", 1);
				System.out.println("parent: " + parent);
				System.out.println("child: " + child);

				System.out.println("[parent clone]");
				Parent parentClone = parent.clone();
				System.out.println("parent clone: " + parentClone); // parent: Parent(parentField=parent)

				System.out.println("[child clone]");
				Child childClone = child.clone();
				System.out.println("child clone: " + childClone); // child: Child(parentField=parent, childField=1)

				Assertions.assertSame(parent.getClass(), parentClone.getClass());
				Assertions.assertSame(child.getClass(), childClone.getClass());
				Assertions.assertTrue(parentClone.getParentField().hashCode() == childClone.getParentField().hashCode());
		}
}
