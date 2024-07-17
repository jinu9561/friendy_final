package web.mvc.entity.meetUpBoard;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMeetUpBoard is a Querydsl query type for MeetUpBoard
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMeetUpBoard extends EntityPathBase<MeetUpBoard> {

    private static final long serialVersionUID = 1684664029L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMeetUpBoard meetUpBoard = new QMeetUpBoard("meetUpBoard");

    public final web.mvc.entity.chatting.QChattingRoom chattingroom;

    public final web.mvc.entity.user.QInterest interest;

    public final ListPath<MeetUpBoardDetailImg, QMeetUpBoardDetailImg> meetUpBoardDetailImgList = this.<MeetUpBoardDetailImg, QMeetUpBoardDetailImg>createList("meetUpBoardDetailImgList", MeetUpBoardDetailImg.class, QMeetUpBoardDetailImg.class, PathInits.DIRECT2);

    public final ListPath<MeetUpBoardList, QMeetUpBoardList> meetUpBoardList = this.<MeetUpBoardList, QMeetUpBoardList>createList("meetUpBoardList", MeetUpBoardList.class, QMeetUpBoardList.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> meetUpDeadLine = createDateTime("meetUpDeadLine", java.util.Date.class);

    public final StringPath meetUpDesc = createString("meetUpDesc");

    public final NumberPath<Integer> meetUpMaxEntry = createNumber("meetUpMaxEntry", Integer.class);

    public final StringPath meetUpName = createString("meetUpName");

    public final NumberPath<Integer> meetUpPwd = createNumber("meetUpPwd", Integer.class);

    public final web.mvc.entity.user.QMeetupRecord meetupRecord;

    public final DateTimePath<java.util.Date> meetUpRegDate = createDateTime("meetUpRegDate", java.util.Date.class);

    public final ListPath<MeetUpRequest, QMeetUpRequest> meetUpRequestsList = this.<MeetUpRequest, QMeetUpRequest>createList("meetUpRequestsList", MeetUpRequest.class, QMeetUpRequest.class, PathInits.DIRECT2);

    public final NumberPath<Long> meetUpSeq = createNumber("meetUpSeq", Long.class);

    public final NumberPath<Integer> meetUpStatus = createNumber("meetUpStatus", Integer.class);

    public final DateTimePath<java.util.Date> meetUpUpdateTime = createDateTime("meetUpUpdateTime", java.util.Date.class);

    public final NumberPath<Integer> nowEntry = createNumber("nowEntry", Integer.class);

    public final web.mvc.entity.user.QUsers user;

    public QMeetUpBoard(String variable) {
        this(MeetUpBoard.class, forVariable(variable), INITS);
    }

    public QMeetUpBoard(Path<? extends MeetUpBoard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMeetUpBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMeetUpBoard(PathMetadata metadata, PathInits inits) {
        this(MeetUpBoard.class, metadata, inits);
    }

    public QMeetUpBoard(Class<? extends MeetUpBoard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.chattingroom = inits.isInitialized("chattingroom") ? new web.mvc.entity.chatting.QChattingRoom(forProperty("chattingroom"), inits.get("chattingroom")) : null;
        this.interest = inits.isInitialized("interest") ? new web.mvc.entity.user.QInterest(forProperty("interest")) : null;
        this.meetupRecord = inits.isInitialized("meetupRecord") ? new web.mvc.entity.user.QMeetupRecord(forProperty("meetupRecord"), inits.get("meetupRecord")) : null;
        this.user = inits.isInitialized("user") ? new web.mvc.entity.user.QUsers(forProperty("user"), inits.get("user")) : null;
    }

}

