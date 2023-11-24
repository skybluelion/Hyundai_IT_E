import styled from 'styled-components';

const SimpleButton = styled.button`
  color: white;
  background-color: green;
`;

const LargeButton = styled(SimpleButton)`
  font-size: 50px;
`;

const ReactButton = (props) => {
  return <button className={props.className}>{props.children}</button>;
};

const ReactLargeButton = styled(ReactButton)`
  font-size: 50px;
`;

const PrimaryButton = styled.button`
  color: ${(props) => (props.primary ? 'white' : 'black')};
  background-color: ${(props) => (props.primary ? 'blue' : 'gray')};
`;

export default function App() {
  return (
    <div>
      <SimpleButton>Simple</SimpleButton>
      <LargeButton>LargeButton</LargeButton>
      <br />
      <ReactButton>ReactButton</ReactButton>
      <ReactLargeButton>ReactLargeButton</ReactLargeButton>
      <br />
      <PrimaryButton>Normal</PrimaryButton>
      <PrimaryButton primary>Primary</PrimaryButton>
    </div>
  );
}
