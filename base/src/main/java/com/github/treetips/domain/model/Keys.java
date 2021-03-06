/**
 * This class is generated by jOOQ
 */
package com.github.treetips.domain.model;


import com.github.treetips.domain.model.tables.Area;
import com.github.treetips.domain.model.tables.Prefecture;
import com.github.treetips.domain.model.tables.records.AreaRecord;
import com.github.treetips.domain.model.tables.records.PrefectureRecord;

import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>test</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<AreaRecord> KEY_AREA_PRIMARY = UniqueKeys0.KEY_AREA_PRIMARY;
	public static final UniqueKey<PrefectureRecord> KEY_PREFECTURE_PRIMARY = UniqueKeys0.KEY_PREFECTURE_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<AreaRecord> KEY_AREA_PRIMARY = createUniqueKey(Area.AREA, Area.AREA.AREA_CD);
		public static final UniqueKey<PrefectureRecord> KEY_PREFECTURE_PRIMARY = createUniqueKey(Prefecture.PREFECTURE, Prefecture.PREFECTURE.PREFECTURE_CD);
	}
}
