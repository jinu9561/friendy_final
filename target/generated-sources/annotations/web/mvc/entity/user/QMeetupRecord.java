package web.mvc.entity.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMeetupRecord is a Querydsl query type for MeetupRecord
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMeetupRecord extends EntityPathBase<MeetupRecord> {

    private static final long serialVersionUID = 2015606809L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMeetupRecord meetupRecord = new QMeetupRecord("meetupRecord");

    public final web.mvc.entity.meetUpBoard.QMeetUpBoard meetUpBoard;

    public final NumberPath<Long> meetUpRecordSeq = createNumber("meetUpRecordSeq", Long.class);

    public final QUserDetail userDetail;

    public final DateTimePath<java.time.LocalDateTime> userRegDate = createDateTime("userRegDate", java.time.LocalDateTime.class);

    public QMeetupRecord(String variable) {
        this(MeetupRecord.class, forVariable(variable), INITS);
    }

    public QMeetupRecord(Path<? extends MeetupRecord> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMeetupRecord(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMeetupRecord(PathMetadata metadata, PathInits inits) {
        this(MeetupRecord.class, metadata, inits);
    }

    public QMeetupRecord(Class<? extends MeetupRecord> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.meetUpBoard = inits.isInitialized("meetUpBoard") ? new web.mvc.entity.meetUpBoard.QMeetUpBoard(forProperty("meetUpBoard"), inits.get("meetUpBoard")) : null;
        this.userDetail = inits.isInitialized("userDetail") ? new QUserDetail(forProperty("userDetail"), inits.get("userDetail")) : null;
    }

}

