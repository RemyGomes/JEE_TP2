import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RoleTest {

	@Test
	void alwaysTrue() {
		assertTrue(true);
	}
	
	@Test
	void roleConstructor() {
		assertThrows(IllegalArgumentException.class, () -> new Role(null));
		assertThrows(IllegalArgumentException.class, () -> new Role("    "));
		assertThrows(IllegalArgumentException.class, () -> new Role(""));
		assertThrows(IllegalArgumentException.class, () -> new Role("!!!"));
		assertDoesNotThrow(() -> new Role("role1"));
	}
	
	@Test
	void roleGetName() {
		Role role = new Role("test");
		assertEquals(role.getName(), "test");
		assertNotEquals(role.getName(), "test2");
	}
	
	@Test
	void roleEquals() {
		assertTrue(new Role("test").equals(new Role("test")));
		assertFalse(new Role("test").equals(new Role("test2")));
	}
}
