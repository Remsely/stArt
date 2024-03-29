import React, { useState } from "react";

import MyButton from "../UI/button/MyButton";
import MyInput from "../UI/input/MyInput";
import ImageLoader from "./ImageLoader";

const PostForm = ({ create }) => {
    const [post, setPost] = useState({ img: null, title: "", body: "" });

    const addNewPost = (e) => {
        e.preventDefault();

        const newPost = {
            ...post,
            id: Date.now(),
        };

        create(newPost);

        setPost({ img: null, title: "", body: "" });
    };

    const handleImageChange = (image) => {
        const reader = new FileReader();

        reader.onloadend = () => {
            setPost({ ...post, img: reader.result });
        };

        reader.readAsDataURL(image);
    };

    return (
        <form>
            <ImageLoader setImage={handleImageChange} />

            <MyInput
                value={post.title}
                onChange={(e) => setPost({ ...post, title: e.target.value })}
                type="text"
                placeholder="Название поста"
            />

            <textarea
                value={post.body}
                onChange={(e) => setPost({ ...post, body: e.target.value })}
                type="text"
                placeholder="Описание поста"
            />

            <MyButton onClick={addNewPost}>Создать пост</MyButton>
        </form>
    );
};

export default PostForm;
