package web.mvc.entity.event;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEventDetailImg is a Querydsl query type for EventDetailImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEventDetailImg extends EntityPathBase<EventDetailImg> {

    private static final long serialVersionUID = 1927026857L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEventDetailImg eventDetailImg = new QEventDetailImg("eventDetailImg");

    public final QEvent event;

    public final StringPath eventDetailImgName = createString("eventDetailImgName");

    public final NumberPath<Long> eventDetailImgSeq = createNumber("eventDetailImgSeq", Long.class);

    public final StringPath eventDetailImgSize = createString("eventDetailImgSize");

    public final StringPath eventDetailImgSrc = createString("eventDetailImgSrc");

    public final StringPath eventDetailImgType = createString("eventDetailImgType");

    public QEventDetailImg(String variable) {
        this(EventDetailImg.class, forVariable(variable), INITS);
    }

    public QEventDetailImg(Path<? extends EventDetailImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEventDetailImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEventDetailImg(PathMetadata metadata, PathInits inits) {
        this(EventDetailImg.class, metadata, inits);
    }

    public QEventDetailImg(Class<? extends EventDetailImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.event = inits.isInitialized("event") ? new QEvent(forProperty("event")) : null;
    }

}

