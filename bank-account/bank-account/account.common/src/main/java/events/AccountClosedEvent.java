package events;

import com.techbank.cqrs.core.events.BaseEvent;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class AccountClosedEvent extends BaseEvent {

}
