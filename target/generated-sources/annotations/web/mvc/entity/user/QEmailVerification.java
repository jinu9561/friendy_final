package web.mvc.entity.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEmailVerification is a Querydsl query type for EmailVerification
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEmailVerification extends EntityPathBase<EmailVerification> {

    private static final long serialVersionUID = -69112943L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEmailVerification emailVerification = new QEmailVerification("emailVerification");

    public final DateTimePath<java.time.LocalDateTime> emailRegDate = createDateTime("emailRegDate", java.time.LocalDateTime.class);

    public final StringPath emailToken = createString("emailToken");

    public final NumberPath<Long> emailVerificationSeq = createNumber("emailVerificationSeq", Long.class);

    public final QUsers user;

    public QEmailVerification(String variable) {
        this(EmailVerification.class, forVariable(variable), INITS);
    }

    public QEmailVerification(Path<? extends EmailVerification> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEmailVerification(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEmailVerification(PathMetadata metadata, PathInits inits) {
        this(EmailVerification.class, metadata, inits);
    }

    public QEmailVerification(Class<? extends EmailVerification> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUsers(forProperty("user"), inits.get("user")) : null;
    }

}

