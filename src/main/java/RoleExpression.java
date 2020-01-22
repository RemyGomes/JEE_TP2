import java.util.function.Predicate;

public interface RoleExpression {

	public abstract Predicate<Roles> toPredicate();
	public abstract String toStringRepresentation();
}
