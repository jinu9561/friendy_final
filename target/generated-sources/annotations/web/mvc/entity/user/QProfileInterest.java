package web.mvc.entity.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProfileInterest is a Querydsl query type for ProfileInterest
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProfileInterest extends EntityPathBase<ProfileInterest> {

    private static final long serialVersionUID = 1446773293L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProfileInterest profileInterest = new QProfileInterest("profileInterest");

    public final QInterest interest;

    public final QProfile profile;

    public final NumberPath<Long> profileInterestSeq = createNumber("profileInterestSeq", Long.class);

    public QProfileInterest(String variable) {
        this(ProfileInterest.class, forVariable(variable), INITS);
    }

    public QProfileInterest(Path<? extends ProfileInterest> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProfileInterest(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProfileInterest(PathMetadata metadata, PathInits inits) {
        this(ProfileInterest.class, metadata, inits);
    }

    public QProfileInterest(Class<? extends ProfileInterest> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.interest = inits.isInitialized("interest") ? new QInterest(forProperty("interest")) : null;
        this.profile = inits.isInitialized("profile") ? new QProfile(forProperty("profile"), inits.get("profile")) : null;
    }

}

