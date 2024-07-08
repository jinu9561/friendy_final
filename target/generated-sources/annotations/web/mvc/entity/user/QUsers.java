package web.mvc.entity.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUsers is a Querydsl query type for Users
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUsers extends EntityPathBase<Users> {

    private static final long serialVersionUID = 528176322L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUsers users = new QUsers("users");

    public final StringPath address = createString("address");

    public final DatePath<java.util.Date> birth = createDate("birth", java.util.Date.class);

    public final EnumPath<web.mvc.enums.users.Classification> country = createEnum("country", web.mvc.enums.users.Classification.class);

    public final StringPath email = createString("email");

    public final QEmailVerification emailVerification;

    public final EnumPath<web.mvc.enums.users.Gender> gender = createEnum("gender", web.mvc.enums.users.Gender.class);

    public final ListPath<JellyTransaction, QJellyTransaction> jellyTransactionList = this.<JellyTransaction, QJellyTransaction>createList("jellyTransactionList", JellyTransaction.class, QJellyTransaction.class, PathInits.DIRECT2);

    public final ListPath<web.mvc.entity.meetUpBoard.MeetUpBoard, web.mvc.entity.meetUpBoard.QMeetUpBoard> meetUpBoardList = this.<web.mvc.entity.meetUpBoard.MeetUpBoard, web.mvc.entity.meetUpBoard.QMeetUpBoard>createList("meetUpBoardList", web.mvc.entity.meetUpBoard.MeetUpBoard.class, web.mvc.entity.meetUpBoard.QMeetUpBoard.class, PathInits.DIRECT2);

    public final ListPath<web.mvc.entity.meetUpBoard.MeetUpBoardList, web.mvc.entity.meetUpBoard.QMeetUpBoardList> meetUpBoardLists = this.<web.mvc.entity.meetUpBoard.MeetUpBoardList, web.mvc.entity.meetUpBoard.QMeetUpBoardList>createList("meetUpBoardLists", web.mvc.entity.meetUpBoard.MeetUpBoardList.class, web.mvc.entity.meetUpBoard.QMeetUpBoardList.class, PathInits.DIRECT2);

    public final ListPath<web.mvc.entity.meetUpBoard.MeetUpRequest, web.mvc.entity.meetUpBoard.QMeetUpRequest> meetUpRequest = this.<web.mvc.entity.meetUpBoard.MeetUpRequest, web.mvc.entity.meetUpBoard.QMeetUpRequest>createList("meetUpRequest", web.mvc.entity.meetUpBoard.MeetUpRequest.class, web.mvc.entity.meetUpBoard.QMeetUpRequest.class, PathInits.DIRECT2);

    public final ListPath<web.mvc.entity.chatting.MessageLog, web.mvc.entity.chatting.QMessageLog> messageLogList = this.<web.mvc.entity.chatting.MessageLog, web.mvc.entity.chatting.QMessageLog>createList("messageLogList", web.mvc.entity.chatting.MessageLog.class, web.mvc.entity.chatting.QMessageLog.class, PathInits.DIRECT2);

    public final StringPath nickName = createString("nickName");

    public final StringPath phone = createString("phone");

    public final ListPath<web.mvc.entity.generalBoard.PhotoBoardLike, web.mvc.entity.generalBoard.QPhotoBoardLike> photoBoardLikeList = this.<web.mvc.entity.generalBoard.PhotoBoardLike, web.mvc.entity.generalBoard.QPhotoBoardLike>createList("photoBoardLikeList", web.mvc.entity.generalBoard.PhotoBoardLike.class, web.mvc.entity.generalBoard.QPhotoBoardLike.class, PathInits.DIRECT2);

    public final ListPath<web.mvc.entity.generalBoard.PhotoBoard, web.mvc.entity.generalBoard.QPhotoBoard> photoBoardList = this.<web.mvc.entity.generalBoard.PhotoBoard, web.mvc.entity.generalBoard.QPhotoBoard>createList("photoBoardList", web.mvc.entity.generalBoard.PhotoBoard.class, web.mvc.entity.generalBoard.QPhotoBoard.class, PathInits.DIRECT2);

    public final QProfile profile;

    public final StringPath Role = createString("Role");

    public final QSmsVerification smsVerification;

    public final QUserDetail userDetail;

    public final StringPath userId = createString("userId");

    public final StringPath userName = createString("userName");

    public final StringPath userPwd = createString("userPwd");

    public final NumberPath<Long> userSeq = createNumber("userSeq", Long.class);

    public QUsers(String variable) {
        this(Users.class, forVariable(variable), INITS);
    }

    public QUsers(Path<? extends Users> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUsers(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUsers(PathMetadata metadata, PathInits inits) {
        this(Users.class, metadata, inits);
    }

    public QUsers(Class<? extends Users> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.emailVerification = inits.isInitialized("emailVerification") ? new QEmailVerification(forProperty("emailVerification"), inits.get("emailVerification")) : null;
        this.profile = inits.isInitialized("profile") ? new QProfile(forProperty("profile"), inits.get("profile")) : null;
        this.smsVerification = inits.isInitialized("smsVerification") ? new QSmsVerification(forProperty("smsVerification"), inits.get("smsVerification")) : null;
        this.userDetail = inits.isInitialized("userDetail") ? new QUserDetail(forProperty("userDetail"), inits.get("userDetail")) : null;
    }

}

