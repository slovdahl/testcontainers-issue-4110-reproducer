package tv.hibox.testcontainers;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.MariaDBContainer;
import org.testcontainers.utility.DockerImageName;

public class Issue4110 {

    @Test
    void containerWithoutTty() {
        MariaDBContainer<?> container = new MariaDBContainer<>( DockerImageName.parse( "mariadb:10.5" ) );
        container.start();

        assertTrue( container.getLogs().contains( "\n" ), "Log output should contain at least one line separator" );
    }

    @Test
    void containerWithTty() {
        MariaDBContainer<?> container = new MariaDBContainer<>( DockerImageName.parse( "mariadb:10.5" ) )
                .withCreateContainerCmdModifier( cmd -> cmd.withTty( true ) );
        container.start();

        assertTrue( container.getLogs().contains( "\n" ), "Log output should contain at least one line separator" );
    }
}
