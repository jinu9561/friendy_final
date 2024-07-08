package web.mvc.entity.meetUpBoard;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMeetUpRequest is a Querydsl query type for MeetUpRequest
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMeetUpRequest extends EntityPathBase<MeetUpRequest> {

    private static final long serialVersionUID = 803197126L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMeetUpRequest meetUpRequest = new QMeetUpRequest("meetUpRequest");

    public final QMeetUpBoard meetUpBoard;

    public final DateTimePath<java.util.Date> meetUpReqeustRegDate = createDateTime("meetUpReqeustRegDate", java.util.Date.class);

    public final NumberPath<Long> meetUpRequestSeq = createNumber("meetUpRequestSeq", Long.class);

    public final NumberPath<Integer> meetUpRequestStatus = createNumber("meetUpRequestStatus", Integer.class);

    public final StringPath requestText = createString("requestText");

    public final web.mvc.entity.user.QUsers user;

    public QMeetUpRequest(String variable) {
        this(MeetUpRequest.class, forVariable(variable), INITS);
    }

    public QMeetUpRequest(Path<? extends MeetUpRequest> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMeetUpRequest(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMeetUpRequest(PathMetadata metadata, PathInits inits) {
        this(MeetUpRequest.class, metadata, inits);
    }

    public QMeetUpRequest(Class<? extends MeetUpRequest> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.meetUpBoard = inits.isInitialized("meetUpBoard") ? new QMeetUpBoard(forProperty("meetUpBoard"), inits.get("meetUpBoard")) : null;
        this.user = inits.isInitialized("user") ? new web.mvc.entity.user.QUsers(forProperty("user"), inits.get("user")) : null;
    }

}

