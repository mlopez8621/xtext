/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.rest.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.rest.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestFactoryImpl extends EFactoryImpl implements RestFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RestFactory init()
  {
    try
    {
      RestFactory theRestFactory = (RestFactory)EPackage.Registry.INSTANCE.getEFactory(RestPackage.eNS_URI);
      if (theRestFactory != null)
      {
        return theRestFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RestFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RestPackage.MODEL: return createModel();
      case RestPackage.TEST: return createTest();
      case RestPackage.ASSERTION: return createAssertion();
      case RestPackage.ASSERT_RESPONSE: return createAssertResponse();
      case RestPackage.COMPARACION: return createComparacion();
      case RestPackage.MAPPING: return createMapping();
      case RestPackage.MAP: return createMap();
      case RestPackage.MAP_NAME: return createMapName();
      case RestPackage.METODO: return createMetodo();
      case RestPackage.DELETE: return createDELETE();
      case RestPackage.POST: return createPOST();
      case RestPackage.PUT: return createPUT();
      case RestPackage.GET: return createGET();
      case RestPackage.RESPONSE: return createResponse();
      case RestPackage.REQUEST: return createRequest();
      case RestPackage.URL: return createURL();
      case RestPackage.PATH_PARAM: return createPathParam();
      case RestPackage.QUERY_PARAM: return createQueryParam();
      case RestPackage.ENTIDAD: return createEntidad();
      case RestPackage.ENTIDAD_MOCK: return createEntidadMock();
      case RestPackage.ENTIDAD_SIMPLE: return createEntidadSimple();
      case RestPackage.ATRIBUTO: return createAtributo();
      case RestPackage.MOCK: return createMock();
      case RestPackage.TIPO_ELEMENTO: return createTipoElemento();
      case RestPackage.TIPO_ENTIDAD: return createTipoEntidad();
      case RestPackage.TIPO_BASICO: return createTipoBasico();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Test createTest()
  {
    TestImpl test = new TestImpl();
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Assertion createAssertion()
  {
    AssertionImpl assertion = new AssertionImpl();
    return assertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssertResponse createAssertResponse()
  {
    AssertResponseImpl assertResponse = new AssertResponseImpl();
    return assertResponse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comparacion createComparacion()
  {
    ComparacionImpl comparacion = new ComparacionImpl();
    return comparacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mapping createMapping()
  {
    MappingImpl mapping = new MappingImpl();
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Map createMap()
  {
    MapImpl map = new MapImpl();
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapName createMapName()
  {
    MapNameImpl mapName = new MapNameImpl();
    return mapName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Metodo createMetodo()
  {
    MetodoImpl metodo = new MetodoImpl();
    return metodo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DELETE createDELETE()
  {
    DELETEImpl delete = new DELETEImpl();
    return delete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public POST createPOST()
  {
    POSTImpl post = new POSTImpl();
    return post;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PUT createPUT()
  {
    PUTImpl put = new PUTImpl();
    return put;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GET createGET()
  {
    GETImpl get = new GETImpl();
    return get;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Response createResponse()
  {
    ResponseImpl response = new ResponseImpl();
    return response;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Request createRequest()
  {
    RequestImpl request = new RequestImpl();
    return request;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public URL createURL()
  {
    URLImpl url = new URLImpl();
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PathParam createPathParam()
  {
    PathParamImpl pathParam = new PathParamImpl();
    return pathParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QueryParam createQueryParam()
  {
    QueryParamImpl queryParam = new QueryParamImpl();
    return queryParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entidad createEntidad()
  {
    EntidadImpl entidad = new EntidadImpl();
    return entidad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntidadMock createEntidadMock()
  {
    EntidadMockImpl entidadMock = new EntidadMockImpl();
    return entidadMock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntidadSimple createEntidadSimple()
  {
    EntidadSimpleImpl entidadSimple = new EntidadSimpleImpl();
    return entidadSimple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Atributo createAtributo()
  {
    AtributoImpl atributo = new AtributoImpl();
    return atributo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mock createMock()
  {
    MockImpl mock = new MockImpl();
    return mock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TipoElemento createTipoElemento()
  {
    TipoElementoImpl tipoElemento = new TipoElementoImpl();
    return tipoElemento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TipoEntidad createTipoEntidad()
  {
    TipoEntidadImpl tipoEntidad = new TipoEntidadImpl();
    return tipoEntidad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TipoBasico createTipoBasico()
  {
    TipoBasicoImpl tipoBasico = new TipoBasicoImpl();
    return tipoBasico;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RestPackage getRestPackage()
  {
    return (RestPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RestPackage getPackage()
  {
    return RestPackage.eINSTANCE;
  }

} //RestFactoryImpl