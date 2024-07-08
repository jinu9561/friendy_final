package web.mvc.entity.generalBoard;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCommunityBoard is a Querydsl query type for CommunityBoard
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCommunityBoard extends EntityPathBase<CommunityBoard> {

    private static final long serialVersionUID = -1078612848L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCommunityBoard communityBoard = new QCommunityBoard("communityBoard");

    public final StringPath boardContent = createString("boardContent");

    public final NumberPath<Integer> boardLike = createNumber("boardLike", Integer.class);

    public final StringPath boardPwd = createString("boardPwd");

    public final DateTimePath<java.time.LocalDateTime> boardRegDate = createDateTime("boardRegDate", java.time.LocalDateTime.class);

    public final StringPath boardTitle = createString("boardTitle");

    public final NumberPath<Integer> boardType = createNumber("boardType", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> boardUpdateDate = createDateTime("boardUpdateDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> commBoardCount = createNumber("commBoardCount", Integer.class);

    public final NumberPath<Long> commBoardSeq = createNumber("commBoardSeq", Long.class);

    public final ListPath<Reply, QReply> replyList = this.<Reply, QReply>createList("replyList", Reply.class, QReply.class, PathInits.DIRECT2);

    public final web.mvc.entity.user.QUsers user;

    public QCommunityBoard(String variable) {
        this(CommunityBoard.class, forVariable(variable), INITS);
    }

    public QCommunityBoard(Path<? extends CommunityBoard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCommunityBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCommunityBoard(PathMetadata metadata, PathInits inits) {
        this(CommunityBoard.class, metadata, inits);
    }

    public QCommunityBoard(Class<? extends CommunityBoard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new web.mvc.entity.user.QUsers(forProperty("user"), inits.get("user")) : null;
    }

}

