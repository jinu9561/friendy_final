package web.mvc.entity.chatting;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNoticePost is a Querydsl query type for NoticePost
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNoticePost extends EntityPathBase<NoticePost> {

    private static final long serialVersionUID = 1803129411L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNoticePost noticePost = new QNoticePost("noticePost");

    public final QChattingRoom chattingroom;

    public final StringPath noticeContent = createString("noticeContent");

    public final DateTimePath<java.util.Date> noticeCreateDate = createDateTime("noticeCreateDate", java.util.Date.class);

    public final NumberPath<Integer> noticePostStatus = createNumber("noticePostStatus", Integer.class);

    public final NumberPath<Long> noticeSeq = createNumber("noticeSeq", Long.class);

    public QNoticePost(String variable) {
        this(NoticePost.class, forVariable(variable), INITS);
    }

    public QNoticePost(Path<? extends NoticePost> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNoticePost(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNoticePost(PathMetadata metadata, PathInits inits) {
        this(NoticePost.class, metadata, inits);
    }

    public QNoticePost(Class<? extends NoticePost> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.chattingroom = inits.isInitialized("chattingroom") ? new QChattingRoom(forProperty("chattingroom"), inits.get("chattingroom")) : null;
    }

}

