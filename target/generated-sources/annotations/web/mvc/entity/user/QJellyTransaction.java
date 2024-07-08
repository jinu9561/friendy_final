package web.mvc.entity.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJellyTransaction is a Querydsl query type for JellyTransaction
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QJellyTransaction extends EntityPathBase<JellyTransaction> {

    private static final long serialVersionUID = 544595238L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJellyTransaction jellyTransaction = new QJellyTransaction("jellyTransaction");

    public final StringPath amount = createString("amount");

    public final StringPath jellyAmount = createString("jellyAmount");

    public final QRefund refund;

    public final DateTimePath<java.time.LocalDateTime> transactionDate = createDateTime("transactionDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> transactionSeq = createNumber("transactionSeq", Long.class);

    public final EnumPath<web.mvc.enums.users.Transaction> transactionType = createEnum("transactionType", web.mvc.enums.users.Transaction.class);

    public final QUsers user;

    public QJellyTransaction(String variable) {
        this(JellyTransaction.class, forVariable(variable), INITS);
    }

    public QJellyTransaction(Path<? extends JellyTransaction> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJellyTransaction(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJellyTransaction(PathMetadata metadata, PathInits inits) {
        this(JellyTransaction.class, metadata, inits);
    }

    public QJellyTransaction(Class<? extends JellyTransaction> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.refund = inits.isInitialized("refund") ? new QRefund(forProperty("refund"), inits.get("refund")) : null;
        this.user = inits.isInitialized("user") ? new QUsers(forProperty("user"), inits.get("user")) : null;
    }

}

