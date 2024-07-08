package web.mvc.entity.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProfile is a Querydsl query type for Profile
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProfile extends EntityPathBase<Profile> {

    private static final long serialVersionUID = 608995811L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProfile profile = new QProfile("profile");

    public final EnumPath<web.mvc.enums.users.ImgStatus> imgStatus = createEnum("imgStatus", web.mvc.enums.users.ImgStatus.class);

    public final StringPath introduce = createString("introduce");

    public final ListPath<ProfileDetailImg, QProfileDetailImg> profileDetailImgList = this.<ProfileDetailImg, QProfileDetailImg>createList("profileDetailImgList", ProfileDetailImg.class, QProfileDetailImg.class, PathInits.DIRECT2);

    public final ListPath<ProfileInterest, QProfileInterest> profileInterestList = this.<ProfileInterest, QProfileInterest>createList("profileInterestList", ProfileInterest.class, QProfileInterest.class, PathInits.DIRECT2);

    public final StringPath profileMainImgName = createString("profileMainImgName");

    public final StringPath profileMainImgSize = createString("profileMainImgSize");

    public final StringPath profileMainImgSrc = createString("profileMainImgSrc");

    public final StringPath profileMainImgType = createString("profileMainImgType");

    public final NumberPath<Long> profileSeq = createNumber("profileSeq", Long.class);

    public final QUsers user;

    public QProfile(String variable) {
        this(Profile.class, forVariable(variable), INITS);
    }

    public QProfile(Path<? extends Profile> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProfile(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProfile(PathMetadata metadata, PathInits inits) {
        this(Profile.class, metadata, inits);
    }

    public QProfile(Class<? extends Profile> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUsers(forProperty("user"), inits.get("user")) : null;
    }

}

