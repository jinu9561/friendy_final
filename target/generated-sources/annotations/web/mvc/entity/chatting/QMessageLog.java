package web.mvc.entity.chatting;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMessageLog is a Querydsl query type for MessageLog
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMessageLog extends EntityPathBase<MessageLog> {

    private static final long serialVersionUID = 1381790824L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMessageLog messageLog = new QMessageLog("messageLog");

    public final StringPath chattingContent = createString("chattingContent");

    public final DateTimePath<java.util.Date> chattingCreateDate = createDateTime("chattingCreateDate", java.util.Date.class);

    public final QChattingRoom chattingroom;

    public final NumberPath<Long> MessageSeq = createNumber("MessageSeq", Long.class);

    public final web.mvc.entity.user.QUsers user;

    public QMessageLog(String variable) {
        this(MessageLog.class, forVariable(variable), INITS);
    }

    public QMessageLog(Path<? extends MessageLog> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMessageLog(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMessageLog(PathMetadata metadata, PathInits inits) {
        this(MessageLog.class, metadata, inits);
    }

    public QMessageLog(Class<? extends MessageLog> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.chattingroom = inits.isInitialized("chattingroom") ? new QChattingRoom(forProperty("chattingroom"), inits.get("chattingroom")) : null;
        this.user = inits.isInitialized("user") ? new web.mvc.entity.user.QUsers(forProperty("user"), inits.get("user")) : null;
    }

}

