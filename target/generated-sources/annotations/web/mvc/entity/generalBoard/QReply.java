package web.mvc.entity.generalBoard;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReply is a Querydsl query type for Reply
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReply extends EntityPathBase<Reply> {

    private static final long serialVersionUID = 186928503L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReply reply = new QReply("reply");

    public final QCommunityBoard communityBoard;

    public final StringPath replyContent = createString("replyContent");

    public final DateTimePath<java.time.LocalDateTime> replyRegDate = createDateTime("replyRegDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> replySeq = createNumber("replySeq", Long.class);

    public final web.mvc.entity.user.QUsers user;

    public QReply(String variable) {
        this(Reply.class, forVariable(variable), INITS);
    }

    public QReply(Path<? extends Reply> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReply(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReply(PathMetadata metadata, PathInits inits) {
        this(Reply.class, metadata, inits);
    }

    public QReply(Class<? extends Reply> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.communityBoard = inits.isInitialized("communityBoard") ? new QCommunityBoard(forProperty("communityBoard"), inits.get("communityBoard")) : null;
        this.user = inits.isInitialized("user") ? new web.mvc.entity.user.QUsers(forProperty("user"), inits.get("user")) : null;
    }

}

