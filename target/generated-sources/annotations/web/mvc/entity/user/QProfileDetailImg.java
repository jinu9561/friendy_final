package web.mvc.entity.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProfileDetailImg is a Querydsl query type for ProfileDetailImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProfileDetailImg extends EntityPathBase<ProfileDetailImg> {

    private static final long serialVersionUID = -575414513L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProfileDetailImg profileDetailImg = new QProfileDetailImg("profileDetailImg");

    public final EnumPath<web.mvc.enums.users.ImgStatus> imgStatus = createEnum("imgStatus", web.mvc.enums.users.ImgStatus.class);

    public final QProfile profile;

    public final StringPath profileDetailImgName = createString("profileDetailImgName");

    public final NumberPath<Long> profileDetailImgSeq = createNumber("profileDetailImgSeq", Long.class);

    public final StringPath profileDetailImgSize = createString("profileDetailImgSize");

    public final StringPath profileDetailImgSrc = createString("profileDetailImgSrc");

    public final StringPath profileDetailImgType = createString("profileDetailImgType");

    public QProfileDetailImg(String variable) {
        this(ProfileDetailImg.class, forVariable(variable), INITS);
    }

    public QProfileDetailImg(Path<? extends ProfileDetailImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProfileDetailImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProfileDetailImg(PathMetadata metadata, PathInits inits) {
        this(ProfileDetailImg.class, metadata, inits);
    }

    public QProfileDetailImg(Class<? extends ProfileDetailImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.profile = inits.isInitialized("profile") ? new QProfile(forProperty("profile"), inits.get("profile")) : null;
    }

}

