import './PostDetails.css'
import axios from 'axios'
import { useEffect, useState } from 'react'

const PostDetails = (props) => {
    const edit = () =>{}

    const [comments, setComments] = useState( 0  )

    // useEffect(
    //   () => {
    //       axios.get('http://localhost:8080/api/posts/' + props.id + '/comments')
    //           .then(response => {
    //             setComments(response.data)
    //               // console.log("RESPONSE:", response.data)
    //           })
    //           .catch(err => console.log(err.message))
    //   },
    //   [props.id])

    return (
        <div className="PostDetails">
            <h2><u>{props.title}</u></h2>
            <h3>{props.author}</h3>
          <div className='text'> 
            <p>{props.content}</p>
          </div>
            <br/> 
            <br/>
            
            <button onClick={edit}>Edit</button>
            <button onClick={() => {props.deletePost(props.id)}}>Delete</button>
          
        </div>
    );
}
export default PostDetails;