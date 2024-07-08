package web.mvc.entity.chatting;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChattingRoom is a Querydsl query type for ChattingRoom
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChattingRoom extends EntityPathBase<ChattingRoom> {

    private static final long serialVersionUID = 909572140L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChattingRoom chattingRoom = new QChattingRoom("chattingRoom");

    public final NumberPath<Long> chattingroomSeq = createNumber("chattingroomSeq", Long.class);

    public final web.mvc.entity.meetUpBoard.QMeetUpBoard meetUpBoard;

    public final ListPath<MessageLog, QMessageLog> messageLogList = this.<MessageLog, QMessageLog>createList("messageLogList", MessageLog.class, QMessageLog.class, PathInits.DIRECT2);

    public final ListPath<NoticePost, QNoticePost> noticePostList = this.<NoticePost, QNoticePost>createList("noticePostList", NoticePost.class, QNoticePost.class, PathInits.DIRECT2);

    public final ListPath<ChatParticipant, QChatParticipant> participants = this.<ChatParticipant, QChatParticipant>createList("participants", ChatParticipant.class, QChatParticipant.class, PathInits.DIRECT2);

    public final StringPath roomId = createString("roomId");

    public final DateTimePath<java.util.Date> roomRegDate = createDateTime("roomRegDate", java.util.Date.class);

    public QChattingRoom(String variable) {
        this(ChattingRoom.class, forVariable(variable), INITS);
    }

    public QChattingRoom(Path<? extends ChattingRoom> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChattingRoom(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChattingRoom(PathMetadata metadata, PathInits inits) {
        this(ChattingRoom.class, metadata, inits);
    }

    public QChattingRoom(Class<? extends ChattingRoom> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.meetUpBoard = inits.isInitialized("meetUpBoard") ? new web.mvc.entity.meetUpBoard.QMeetUpBoard(forProperty("meetUpBoard"), inits.get("meetUpBoard")) : null;
    }

}

