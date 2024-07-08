package web.mvc.entity.report;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReport is a Querydsl query type for Report
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReport extends EntityPathBase<Report> {

    private static final long serialVersionUID = 1982109553L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReport report = new QReport("report");

    public final web.mvc.entity.user.QUsers receiver;

    public final StringPath reportDescription = createString("reportDescription");

    public final DateTimePath<java.time.LocalDateTime> reportRegDate = createDateTime("reportRegDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> reportResult = createNumber("reportResult", Integer.class);

    public final NumberPath<Long> reportSeq = createNumber("reportSeq", Long.class);

    public final NumberPath<Integer> reportStatus = createNumber("reportStatus", Integer.class);

    public final QReportType reportType;

    public final StringPath reportUrl = createString("reportUrl");

    public final web.mvc.entity.user.QUsers sender;

    public QReport(String variable) {
        this(Report.class, forVariable(variable), INITS);
    }

    public QReport(Path<? extends Report> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReport(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReport(PathMetadata metadata, PathInits inits) {
        this(Report.class, metadata, inits);
    }

    public QReport(Class<? extends Report> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.receiver = inits.isInitialized("receiver") ? new web.mvc.entity.user.QUsers(forProperty("receiver"), inits.get("receiver")) : null;
        this.reportType = inits.isInitialized("reportType") ? new QReportType(forProperty("reportType")) : null;
        this.sender = inits.isInitialized("sender") ? new web.mvc.entity.user.QUsers(forProperty("sender"), inits.get("sender")) : null;
    }

}

