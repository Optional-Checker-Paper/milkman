package milkman.ui.plugin;

import milkman.domain.RequestContainer;
import milkman.domain.ResponseContainer;

import java.util.Optional;

public interface PluginRequestExecutor {

	Optional<RequestContainer> getDetails(String requestId);

	Optional<ResponseContainer> executeRequest(String requestId);
}
