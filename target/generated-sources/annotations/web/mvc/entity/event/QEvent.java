package web.mvc.entity.event;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEvent is a Querydsl query type for Event
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEvent extends EntityPathBase<Event> {

    private static final long serialVersionUID = -253609207L;

    public static final QEvent event = new QEvent("event");

    public final StringPath eventContent = createString("eventContent");

    public final DatePath<java.util.Date> eventDeadLine = createDate("eventDeadLine", java.util.Date.class);

    public final ListPath<EventDetailImg, QEventDetailImg> eventDetailImg = this.<EventDetailImg, QEventDetailImg>createList("eventDetailImg", EventDetailImg.class, QEventDetailImg.class, PathInits.DIRECT2);

    public final StringPath eventMainImg = createString("eventMainImg");

    public final StringPath eventMainImgName = createString("eventMainImgName");

    public final NumberPath<Integer> eventMaxEntry = createNumber("eventMaxEntry", Integer.class);

    public final StringPath eventName = createString("eventName");

    public final DateTimePath<java.time.LocalDateTime> eventRegDate = createDateTime("eventRegDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> eventSeq = createNumber("eventSeq", Long.class);

    public final EnumPath<web.mvc.enums.event.EventStatus> eventStatus = createEnum("eventStatus", web.mvc.enums.event.EventStatus.class);

    public final DateTimePath<java.time.LocalDateTime> eventUpdateTime = createDateTime("eventUpdateTime", java.time.LocalDateTime.class);

    public QEvent(String variable) {
        super(Event.class, forVariable(variable));
    }

    public QEvent(Path<? extends Event> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEvent(PathMetadata metadata) {
        super(Event.class, metadata);
    }

}

