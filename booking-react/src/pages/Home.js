import Footer from "./layout/Footer";
import '../App.css'
import '../Home.css'
import Navbar from "./layout/Navbar";
import {Col, Container, Row} from "reactstrap";
function Home() {
    return (
        <main>
            <Navbar/>
            <div className={'content'}>
                <main>
                    <Container className="py-5">
                        <Row>
                            <Col md={6}>
                                <h1 className="mb-4">Welcome to the Cinema</h1>
                                <p>
                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed auctor velit vitae
                                    mauris rhoncus, non vulputate augue laoreet. Donec vitae quam eget libero blandit
                                    luctus ut eu ex. Pellentesque malesuada interdum mauris, vel dictum ex aliquet
                                    vitae.
                                </p>
                                <p>
                                    Nunc id eros nulla. Praesent tristique ligula in risus congue, id vestibulum justo
                                    viverra. Sed lobortis ligula nec sapien interdum, vel bibendum dolor blandit.
                                    Integer at malesuada nibh, ac lobortis ipsum.
                                </p>
                            </Col>
                            <Col md={6} className="d-flex align-items-center justify-content-center">
                                <img src={'https://www.bionicbuzz.com/wp-content/uploads/2022/07/Fine-Arts-Theatre-Beverly-Hills.jpg'} alt="Cinema" className="w-100" />
                            </Col>
                        </Row>
                    </Container>
                </main>
                <main>
                    <Container className="py-5">
                        <Row>
                            <Col md={6}>
                                <h1 className="mb-4">Welcome to the Cinema</h1>
                                <p>
                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed auctor velit vitae
                                    mauris rhoncus, non vulputate augue laoreet. Donec vitae quam eget libero blandit
                                    luctus ut eu ex. Pellentesque malesuada interdum mauris, vel dictum ex aliquet
                                    vitae.
                                </p>
                                <p>
                                    Nunc id eros nulla. Praesent tristique ligula in risus congue, id vestibulum justo
                                    viverra. Sed lobortis ligula nec sapien interdum, vel bibendum dolor blandit.
                                    Integer at malesuada nibh, ac lobortis ipsum.
                                </p>
                            </Col>
                            <Col md={6} className="d-flex align-items-center justify-content-center">
                                <img src={'https://www.bionicbuzz.com/wp-content/uploads/2022/07/Fine-Arts-Theatre-Beverly-Hills.jpg'} alt="Cinema" className="w-100" />
                            </Col>
                        </Row>
                    </Container>
                </main>
            </div>

            <div className={'footer'}>
            <Footer/>
            </div>

        </main>

    );
}
export default Home;