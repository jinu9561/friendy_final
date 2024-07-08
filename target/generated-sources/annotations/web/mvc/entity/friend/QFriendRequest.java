package web.mvc.entity.friend;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFriendRequest is a Querydsl query type for FriendRequest
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFriendRequest extends EntityPathBase<FriendRequest> {

    private static final long serialVersionUID = 516953374L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFriendRequest friendRequest = new QFriendRequest("friendRequest");

    public final NumberPath<Long> friendRequestSeq = createNumber("friendRequestSeq", Long.class);

    public final web.mvc.entity.user.QUsers receiver;

    public final DateTimePath<java.time.LocalDateTime> requestRegDate = createDateTime("requestRegDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> requestStatus = createNumber("requestStatus", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> requestUpdateDate = createDateTime("requestUpdateDate", java.time.LocalDateTime.class);

    public final web.mvc.entity.user.QUsers sender;

    public QFriendRequest(String variable) {
        this(FriendRequest.class, forVariable(variable), INITS);
    }

    public QFriendRequest(Path<? extends FriendRequest> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFriendRequest(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFriendRequest(PathMetadata metadata, PathInits inits) {
        this(FriendRequest.class, metadata, inits);
    }

    public QFriendRequest(Class<? extends FriendRequest> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.receiver = inits.isInitialized("receiver") ? new web.mvc.entity.user.QUsers(forProperty("receiver"), inits.get("receiver")) : null;
        this.sender = inits.isInitialized("sender") ? new web.mvc.entity.user.QUsers(forProperty("sender"), inits.get("sender")) : null;
    }

}

