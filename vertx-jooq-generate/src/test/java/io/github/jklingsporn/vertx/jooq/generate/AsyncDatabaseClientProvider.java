package io.github.jklingsporn.vertx.jooq.generate;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.asyncsql.AsyncSQLClient;
import io.vertx.ext.asyncsql.MySQLClient;

/**
 * Created by jensklingsporn on 15.02.18.
 */
public class AsyncDatabaseClientProvider {

    private static AsyncDatabaseClientProvider INSTANCE;
    public static AsyncDatabaseClientProvider getInstance() {
        return INSTANCE == null ? INSTANCE = new AsyncDatabaseClientProvider() : INSTANCE;
    }

    private final Vertx vertx;

    private AsyncDatabaseClientProvider() {
        this.vertx = Vertx.vertx();
    }

    public AsyncSQLClient getClient() {
        return MySQLClient.createNonShared(vertx, new JsonObject()
                .put("host", "127.0.0.1")
                .put("username", "vertx")
                .putNull("password")
                .put("database", "vertx")
                .put("maxPoolSize",1));
    }

    public Vertx getVertx() {
        return vertx;
    }
}
