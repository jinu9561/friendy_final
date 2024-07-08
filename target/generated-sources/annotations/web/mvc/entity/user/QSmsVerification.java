package web.mvc.entity.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSmsVerification is a Querydsl query type for SmsVerification
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSmsVerification extends EntityPathBase<SmsVerification> {

    private static final long serialVersionUID = -1888759730L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSmsVerification smsVerification = new QSmsVerification("smsVerification");

    public final DateTimePath<java.time.LocalDateTime> smsRegDate = createDateTime("smsRegDate", java.time.LocalDateTime.class);

    public final StringPath smsToken = createString("smsToken");

    public final NumberPath<Long> smsVerificationSeq = createNumber("smsVerificationSeq", Long.class);

    public final QUsers user;

    public QSmsVerification(String variable) {
        this(SmsVerification.class, forVariable(variable), INITS);
    }

    public QSmsVerification(Path<? extends SmsVerification> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSmsVerification(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSmsVerification(PathMetadata metadata, PathInits inits) {
        this(SmsVerification.class, metadata, inits);
    }

    public QSmsVerification(Class<? extends SmsVerification> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUsers(forProperty("user"), inits.get("user")) : null;
    }

}

