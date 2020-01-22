import java.util.Set;

public class Roles {

	private Set<Role> roles;
	
	public Roles(Set<Role> roles) {
		this.roles = roles;
	}
	
	public boolean contains(Role role) {
		return roles.contains(role);
	}
	
	public void add(Role role) {
		roles.add(role);
	}


}
