package web.mvc.entity.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserDetail is a Querydsl query type for UserDetail
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserDetail extends EntityPathBase<UserDetail> {

    private static final long serialVersionUID = -1390999166L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserDetail userDetail = new QUserDetail("userDetail");

    public final DateTimePath<java.time.LocalDateTime> lastLoginDate = createDateTime("lastLoginDate", java.time.LocalDateTime.class);

    public final ListPath<MeetupRecord, QMeetupRecord> meetupRecord = this.<MeetupRecord, QMeetupRecord>createList("meetupRecord", MeetupRecord.class, QMeetupRecord.class, PathInits.DIRECT2);

    public final QUsers user;

    public final NumberPath<Long> UserDetailSeq = createNumber("UserDetailSeq", Long.class);

    public final NumberPath<Integer> userJelly = createNumber("userJelly", Integer.class);

    public final NumberPath<Integer> userRate = createNumber("userRate", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> userRegDate = createDateTime("userRegDate", java.time.LocalDateTime.class);

    public final EnumPath<web.mvc.enums.users.State> userState = createEnum("userState", web.mvc.enums.users.State.class);

    public final DateTimePath<java.time.LocalDateTime> userUpdateDate = createDateTime("userUpdateDate", java.time.LocalDateTime.class);

    public QUserDetail(String variable) {
        this(UserDetail.class, forVariable(variable), INITS);
    }

    public QUserDetail(Path<? extends UserDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserDetail(PathMetadata metadata, PathInits inits) {
        this(UserDetail.class, metadata, inits);
    }

    public QUserDetail(Class<? extends UserDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUsers(forProperty("user"), inits.get("user")) : null;
    }

}

