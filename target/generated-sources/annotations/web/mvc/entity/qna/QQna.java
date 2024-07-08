package web.mvc.entity.qna;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQna is a Querydsl query type for Qna
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQna extends EntityPathBase<Qna> {

    private static final long serialVersionUID = 340093213L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQna qna = new QQna("qna");

    public final StringPath qnaDesc = createString("qnaDesc");

    public final DateTimePath<java.time.LocalDateTime> qnaRegDate = createDateTime("qnaRegDate", java.time.LocalDateTime.class);

    public final StringPath qnaReply = createString("qnaReply");

    public final NumberPath<Long> qnaSeq = createNumber("qnaSeq", Long.class);

    public final NumberPath<Integer> qnaStatus = createNumber("qnaStatus", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> qnaUpdateDate = createDateTime("qnaUpdateDate", java.time.LocalDateTime.class);

    public final web.mvc.entity.user.QUsers user;

    public QQna(String variable) {
        this(Qna.class, forVariable(variable), INITS);
    }

    public QQna(Path<? extends Qna> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQna(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQna(PathMetadata metadata, PathInits inits) {
        this(Qna.class, metadata, inits);
    }

    public QQna(Class<? extends Qna> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new web.mvc.entity.user.QUsers(forProperty("user"), inits.get("user")) : null;
    }

}

