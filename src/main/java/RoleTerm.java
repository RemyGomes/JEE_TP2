import java.util.function.Predicate;

public class RoleTerm implements RoleExpression {
	
	private Role role;

	@Override
	public Predicate<Roles> toPredicate() {
		
		return new Predicate<Roles>() {
			@Override
			public boolean test(Roles roles) {
				return roles.contains(role);
			}
		};
	}

	@Override
	public String toStringRepresentation() {
		return role.getName();
	}

}
