package OptionalClass;

import java.util.Optional;

public class OptionaDemo {
	
	public static void main(String[] args) {
		Optional<String> empty = Optional.empty();
		System.out.println(empty.isPresent());
		

		Optional<String> opt = Optional.of("static value");
		System.out.println(opt);

	}

}
