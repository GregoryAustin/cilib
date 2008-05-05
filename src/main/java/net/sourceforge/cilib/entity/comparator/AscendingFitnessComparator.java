/*
 * AscendingFitnessComparator.java
 *
 * Copyright (C) 2003 - 2008
 * Computational Intelligence Research Group (CIRG@UP)
 * Department of Computer Science
 * University of Pretoria
 * South Africa
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package net.sourceforge.cilib.entity.comparator;

import java.util.Comparator;

import net.sourceforge.cilib.entity.Entity;
import net.sourceforge.cilib.problem.Fitness;

/**
 * Comparator to order {@linkplain Entity} instances based on fitness values.
 * This comparator results in a ascending order.
 * 
 * @author Gary Pampara
 */
public class AscendingFitnessComparator implements Comparator<Entity> {	

	/**
	 * Compare the {@linkplain Entity} objects returning the desired ordering.
	 * @param e1 The first {@linkplain Entity} to be used in the comparison.
	 * @param e2 The second {@linkplain Entity} to be used in the comparison.
	 * @return -1 if e1 is less than e2;
	 *         0 if e1 and e2 are equal
	 *         1 if e2 is greater than e2
	 */
	public int compare(Entity e1, Entity e2) {
		Fitness f1 = e1.getFitness();
		Fitness f2 = e2.getFitness();
		
		return f2.compareTo(f1);
	}

}
