/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TInheritanceCapitals implements org.jooq.test.postgres.generatedclasses.tables.interfaces.ITInheritanceCapitals {

	private static final long serialVersionUID = 2074893235;

	private final java.lang.String  name;
	private final java.lang.Integer population;
	private final java.lang.Integer altitude;
	private final java.lang.String  state;

	public TInheritanceCapitals(
		java.lang.String  name,
		java.lang.Integer population,
		java.lang.Integer altitude,
		java.lang.String  state
	) {
		this.name = name;
		this.population = population;
		this.altitude = altitude;
		this.state = state;
	}

	@Override
	public java.lang.String getName() {
		return this.name;
	}

	@Override
	public java.lang.Integer getPopulation() {
		return this.population;
	}

	@Override
	public java.lang.Integer getAltitude() {
		return this.altitude;
	}

	@Override
	public java.lang.String getState() {
		return this.state;
	}
}