package tech.adriano.service.domain.model.primitive;

public final class Name {
	
	private final String first;
	private final String last;
	
	
	public Name(String first, String last) {
		this.last = last;
		this.first = first;
	}
	
	
	public static NameBuilder builder() {
		return new NameBuilder();
	}
	
	
	public String getFirst() {
		return first;
	}
	
	
	public String getLast() {
		return last;
	}
	
	
	public static class NameBuilder {
		
		private String first;
		private String last;
		
		
		public NameBuilder first(String first) {
			this.first = first;
			return this;
		}
		
		
		public NameBuilder last(String last) {
			this.last = last;
			return this;
		}
		
		
		public Name build() {
			return new Name(first, last);
		}
	}
}
