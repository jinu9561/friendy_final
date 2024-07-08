package web.mvc.entity.friend;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFriendList is a Querydsl query type for FriendList
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFriendList extends EntityPathBase<FriendList> {

    private static final long serialVersionUID = 1848389743L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFriendList friendList = new QFriendList("friendList");

    public final DateTimePath<java.time.LocalDateTime> friendRegDate = createDateTime("friendRegDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> friendsListSeq = createNumber("friendsListSeq", Long.class);

    public final NumberPath<Integer> friendStatus = createNumber("friendStatus", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> friendUpdateDate = createDateTime("friendUpdateDate", java.time.LocalDateTime.class);

    public final web.mvc.entity.user.QUsers friendUser;

    public final web.mvc.entity.user.QUsers user;

    public QFriendList(String variable) {
        this(FriendList.class, forVariable(variable), INITS);
    }

    public QFriendList(Path<? extends FriendList> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFriendList(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFriendList(PathMetadata metadata, PathInits inits) {
        this(FriendList.class, metadata, inits);
    }

    public QFriendList(Class<? extends FriendList> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.friendUser = inits.isInitialized("friendUser") ? new web.mvc.entity.user.QUsers(forProperty("friendUser"), inits.get("friendUser")) : null;
        this.user = inits.isInitialized("user") ? new web.mvc.entity.user.QUsers(forProperty("user"), inits.get("user")) : null;
    }

}

