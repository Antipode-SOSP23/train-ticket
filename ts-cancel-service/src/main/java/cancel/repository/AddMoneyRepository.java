package cancel.repository;

import cancel.entity.Money;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author fdse
 */
public interface AddMoneyRepository extends CrudRepository<Money,String> {

    /**
     * find by user id
     *
     * @param userId user id
     * @return List<Money>
     */
    List<Money> findByUserId(String userId);

    /**
     * find by order id
     *
     * @param orderId order id
     * @return List<Money>
     */
    List<Money> findByOrderId(String orderId);
}
