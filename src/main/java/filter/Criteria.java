package filter;

import java.util.List;

/**
 * @author yebing
 */
public interface Criteria {
    /**
     * meetCriteria
     *
     * @param persons
     * @return
     */
    List<Person> meetCriteria(List<Person> persons);
}
