package inside_payment.repository;

import inside_payment.entity.Money;
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
     * find first by user id
     *
     * @param userId user id
     * @return List<Money>
     */
    Money findFirstByUserId(String userId);

    /**
     * find by order id
     *
     * @param orderId order id
     * @return List<Money>
     */
    List<Money> findByOrderId(String orderId);

    /**
     * find all
     *
     * @return List<Money>
     */
    @Override
    List<Money> findAll();
}
