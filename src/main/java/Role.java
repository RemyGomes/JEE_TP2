
public class Role {

	private String name;
	
	public Role(String name) {
		if (name == null) {
			throw new IllegalArgumentException("Name cannot be null");
		}
		if (name.isBlank()) {
			throw new IllegalArgumentException("Name cannot be blank");
		}
		if (name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		for (char c : name.toCharArray()) {
			if(!Character.isLetterOrDigit(c)) {
				throw new IllegalArgumentException("Name must contain only letters and digits");
			}
		}
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
}