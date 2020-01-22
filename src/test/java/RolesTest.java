import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

class RolesTest {

	@Test
	void alwaysTrue() {
		assertTrue(true);
	}

	@Test
	void rolesArrayContainsRole() {
		Roles roles = new Roles(new HashSet<Role>());
		Role roleToBeContained = new Role("2");
		Role roleNotContained = new Role("5");
		for(int i = 0; i < 5; i++) {
			roles.add(new Role(i + ""));
		}
		
		assertTrue(roles.contains(roleToBeContained));
		assertFalse(roles.contains(roleNotContained));
	}
}
