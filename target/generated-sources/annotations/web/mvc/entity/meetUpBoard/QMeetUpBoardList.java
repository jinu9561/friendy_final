package web.mvc.entity.meetUpBoard;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMeetUpBoardList is a Querydsl query type for MeetUpBoardList
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMeetUpBoardList extends EntityPathBase<MeetUpBoardList> {

    private static final long serialVersionUID = 772889883L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMeetUpBoardList meetUpBoardList = new QMeetUpBoardList("meetUpBoardList");

    public final QMeetUpBoard meetUpBoard;

    public final NumberPath<Long> meetUpBoardListSeq = createNumber("meetUpBoardListSeq", Long.class);

    public final web.mvc.entity.user.QUsers user;

    public QMeetUpBoardList(String variable) {
        this(MeetUpBoardList.class, forVariable(variable), INITS);
    }

    public QMeetUpBoardList(Path<? extends MeetUpBoardList> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMeetUpBoardList(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMeetUpBoardList(PathMetadata metadata, PathInits inits) {
        this(MeetUpBoardList.class, metadata, inits);
    }

    public QMeetUpBoardList(Class<? extends MeetUpBoardList> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.meetUpBoard = inits.isInitialized("meetUpBoard") ? new QMeetUpBoard(forProperty("meetUpBoard"), inits.get("meetUpBoard")) : null;
        this.user = inits.isInitialized("user") ? new web.mvc.entity.user.QUsers(forProperty("user"), inits.get("user")) : null;
    }

}

