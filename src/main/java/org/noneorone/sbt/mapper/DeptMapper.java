package org.noneorone.sbt.mapper;

import org.mybatis.spring.annotation.MapperScan;
import org.noneorone.sbt.domain.Dept;

/**
 * Departement Mapper
 *
 * @author Mars.Wong(noneorone@yeah.net) at 2017/7/21 10:42<br/>
 * @since 1.0
 */
@MapperScan
public interface DeptMapper {

	/**
	 * Query Department by ID
	 *
	 * @param id
	 * @return
	 */
	Dept selectDeptById(Integer id);

}
