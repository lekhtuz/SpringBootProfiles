package com.dmitry.profiles;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @author du376ye
 *
 */
@Component
@ConfigurationProperties(prefix="dmitry")
@Validated
public class ProfilesProperties {
	@NotNull private String stringProperty;
	private Integer integerProperty;
	private Subproperties subproperties;

	/**
	 * @return the stringProperty
	 */
	public String getStringProperty() {
		return stringProperty;
	}

	/**
	 * @param stringProperty the stringProperty to set
	 */
	public void setStringProperty(String stringProperty) {
		this.stringProperty = stringProperty;
	}

	/**
	 * @return the integerProperty
	 */
	public Integer getIntegerProperty() {
		return integerProperty;
	}

	/**
	 * @param integerProperty the integerProperty to set
	 */
	public void setIntegerProperty(Integer integerProperty) {
		this.integerProperty = integerProperty;
	}

	/**
	 * @return the subproperties
	 */
	public Subproperties getSubproperties() {
		return subproperties;
	}

	/**
	 * @param subproperties the subproperties to set
	 */
	public void setSubproperties(Subproperties subproperties) {
		this.subproperties = subproperties;
	}

	public static class Subproperties {
		private String stringSubproperty;

		/**
		 * @return the stringSubproperty
		 */
		public String getStringSubproperty() {
			return stringSubproperty;
		}

		/**
		 * @param stringSubproperty the stringSubproperty to set
		 */
		public void setStringSubproperty(String stringSubproperty) {
			this.stringSubproperty = stringSubproperty;
		}
	}
}
