package web.mvc.entity.meetUpBoard;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMeetUpBoardDetailImg is a Querydsl query type for MeetUpBoardDetailImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMeetUpBoardDetailImg extends EntityPathBase<MeetUpBoardDetailImg> {

    private static final long serialVersionUID = -1373670571L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMeetUpBoardDetailImg meetUpBoardDetailImg = new QMeetUpBoardDetailImg("meetUpBoardDetailImg");

    public final QMeetUpBoard meetUpBoard;

    public final StringPath meetUpDetailImgName = createString("meetUpDetailImgName");

    public final NumberPath<Long> meetUpDetailImgSeq = createNumber("meetUpDetailImgSeq", Long.class);

    public final StringPath meetUpDetailImgSize = createString("meetUpDetailImgSize");

    public final StringPath meetUpDetailImgSrc = createString("meetUpDetailImgSrc");

    public final StringPath meetUpDetailImgType = createString("meetUpDetailImgType");

    public QMeetUpBoardDetailImg(String variable) {
        this(MeetUpBoardDetailImg.class, forVariable(variable), INITS);
    }

    public QMeetUpBoardDetailImg(Path<? extends MeetUpBoardDetailImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMeetUpBoardDetailImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMeetUpBoardDetailImg(PathMetadata metadata, PathInits inits) {
        this(MeetUpBoardDetailImg.class, metadata, inits);
    }

    public QMeetUpBoardDetailImg(Class<? extends MeetUpBoardDetailImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.meetUpBoard = inits.isInitialized("meetUpBoard") ? new QMeetUpBoard(forProperty("meetUpBoard"), inits.get("meetUpBoard")) : null;
    }

}

